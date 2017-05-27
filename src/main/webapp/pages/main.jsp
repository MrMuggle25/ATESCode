<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 
	session = request.getSession(false);
	if(session.getAttribute("idnumber") != null){
		Connection con = null;
		PreparedStatement ps;
		Resultset rs;
		String query;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){
			System.out.println("e");
		}
		
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root", "");
			query = "SELECT * FROM User WHERE ID=? AND PASSWORD=?";
			ps = con.prepareStatement(query);
			ps.setString(1, session.getAttribute("idnumber").toString());
			//ps.setString(2, password);
			rs = ps.executeQuery();
			
			if(rs.next()){
				out.println("Welcome, " + rs.getString("name") + "!!");
				out.println("<br/><br/> Sessiong created for you");
				
				//LOGOUT
				
				out.println("<form action=\"logout.jsp\" method=\"post\">");
				out.println("<button type=\"submit\" name=\"logout\" value=\"Logout\">");
				out.println("</form>");
			
						
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}
	if("POST".equalsIgnoreCase(request.getMethod())){
		if(request.getParameter("login") != null){
			if(request.getParameter("login").equals("Login")){
				String idnumber = request.getParameter("idnumber");
				String password = request.getParameter("password");
				
				Connection con = null;
				PreparedStatement ps;
				ResultSet rs;
				String query;
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
				}
				catch(Exception e){
					System.out.println("e");
				}
				
				try{
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root", "");
					query = "SELECT * FROM User WHERE ID=? AND PASSWORD=?";
					ps = con.prepareStatement(query);
					ps.setString(1, idnumber);
					ps.setString(2, password);
					rs = ps.executeQuery();
					
					if(rs.next()){
						session = request.getSession();
						session.setAttribute("idnumber", idnumber);
						response.sendRedirect("main.jsp");
					}
				}
				catch(SQLException e){
					System.out.println(e);
				}
			}
		}
	}


%>-->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="font-family:Century Gothic;">
		WELCOME USER <!--  ${sessionScope.idnumber }-->
	</h1>
	<form action="${pageContext.request.contextPath}/login/logout" method="post">
		<button type="submit"> Logout </a></button>
	
	</form>
	
</body>
</html>