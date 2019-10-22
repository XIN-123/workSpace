package cn.com.kgc.tancoo.businessmanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.kgc.tancoo.businessmanager.dao.impl.UserDaoImpl;
import cn.com.kgc.tancoo.businessmanager.entity.User;

/**
 * Servlet implementation class Doregister
 */
@WebServlet("/Doregister")
public class Doregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");	
response.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
PrintWriter out=response.getWriter();//
UserDaoImpl uDi=new UserDaoImpl ();

String user_name=request.getParameter("user_name");//姓名
System.out.println(user_name);
String userAddr=request.getParameter("userAddr");//地址
System.out.println(userAddr);
String userTruename=request.getParameter("userTruename");//地址
System.out.println(userTruename);
String userSex=request.getParameter("userSex");//性别
System.out.println(userSex);

String userBuy =request.getParameter("userBuy");//买家卖家
System.out.println(userBuy);
int userType= Integer.parseInt(userBuy);

String YYYY =request.getParameter("YYYY");//年
System.out.println(YYYY);
String MM =request.getParameter("MM");//月

String DD =request.getParameter("DD");//日
String time=YYYY+"-"+MM+"-"+DD;
String phone =request.getParameter("phone");//手机号
String pwd=request.getParameter("pwd");//密码
//注册时间 now（） ,user.getUserRegtime(),
User user=new User(0, user_name, pwd, userAddr, phone, userTruename, userSex, time, new Date() , userType, 0);
if( uDi.add(user)==1) {
out.print("<script>alert('账号注册成功');location.href='login.jsp';</script>");	
}else {
out.print("<script>alert('账号注册失败请重新注册');location.href='login.jsp';</script>");	
}
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}
