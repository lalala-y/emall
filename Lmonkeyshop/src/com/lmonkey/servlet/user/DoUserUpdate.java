package com.lmonkey.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lmonkey.entity.LMONKEY_USER;
import com.lmonkey.service.LMONKEY_USERDao;

/**
 * Servlet implementation class DoUserUpdate
 */
@WebServlet("/manage/admin_douserupdate")
public class DoUserUpdate extends HttpServlet {
	   
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置字符集
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				
				String username = request.getParameter("userName");
				String name = request.getParameter("Name");
				String pwd = request.getParameter("Password");
				String sex = request.getParameter("sex");
				String birthday = request.getParameter("birthday");
				String email = request.getParameter("email");
				String mobile = request.getParameter("mobile");
				String address = request.getParameter("address");
				String userStatus = request.getParameter("userStatus");
				
				int status = 1;
				
				if(userStatus != null) {
					status = Integer.parseInt(userStatus);
				}
				
				
				//创建用户实例
				LMONKEY_USER user = new LMONKEY_USER(username,name,pwd,sex,birthday,null,email,mobile,address,status);
				//加入数据库的用户表中
				int count =LMONKEY_USERDao.update(user);
				
				
				
				if(count>0 ) {
					response.sendRedirect("admin_douserselect?cp="+request.getParameter("cpage"));
				}else {
					PrintWriter out = response.getWriter();
					
					out.write("<script>");
					out.write("alert('用户修改失败')");
					out.write("location.href='manage/admin_touserupdate?id="+username+"'");
					out.write("</script>");
				}
	}

}
