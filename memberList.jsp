<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, mallPack.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h1> 회원목록 </h1>
<%

	ArrayList<RegisterDTO> vlist = (ArrayList<RegisterDTO>) session.getAttribute("vlist");
	for(int i=0; i< vlist.size(); i++){
		RegisterDTO regBean = vlist.get(i);
		out.println( regBean.getId()+", " );
		out.println( regBean.getPassword()+", " );
		out.println( regBean.getName()+", " );
		out.println( regBean.getEmail()+", " );
		out.println( regBean.getPhone()+", " );
		out.println( regBean.getAddress()+", " );
		out.println( regBean.getJob()+"<br> " );
	}

%>

</body>
</html>