<%@page import="negocio.Usuario" %>
<%@page import="org.hibernate.Query" %>
<%@page import="org.hibernate.Session" %>
<%@page import="negocio.HibernateUtil" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            Session s= HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            Query q=s.createQuery("from Usuario where idUsuario=1");
            
            Usuario u=(Usuario) q.uniqueResult();
        
        %>
        <%=u.getNombre() %>
    </body>
</html>
