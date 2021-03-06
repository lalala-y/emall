package com.lmonkey.servlet.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lmonkey.entity.LMONKEY_USER;
import com.lmonkey.service.LMONKEY_USERDao;

/**
 * Servlet implementation class DoUserSelect
 */
@WebServlet("/manage/admin_douserselect")
public class DoUserSelect extends HttpServlet {
	
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cpage = 1;//当前页
		int count = 3;//每页条目数
		//获取用户指定页面
		String cp = request.getParameter("cp");
		
		String keyword = request.getParameter("keywords");
		
		if(cp!=null) {
			cpage =Integer.parseInt(cp);
		}
		int arr[] = LMONKEY_USERDao.totalPage(count,keyword);
		
 		
		// 获取所用的用户记录
		ArrayList<LMONKEY_USER> list = LMONKEY_USERDao.selectAll(cpage, count, keyword);
		
		//放到请求对象域里
		request.setAttribute("userlist", list);
		request.setAttribute("tsum", arr[0]);
		request.setAttribute("tpage", arr[1]);
		request.setAttribute("cpage", cpage);
		
		if(keyword != null) {
			request.setAttribute("searchParams", "&keywords="+keyword);
		}
		
		request.getRequestDispatcher("admin_user.jsp").forward(request,response);
		
	}

	

}
