/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-05-27 21:17:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import seller.login.Userlog;
import seller.login.Userdatadb;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("seller.login.Userdatadb");
    _jspx_imports_classes.add("seller.login.Userlog");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/profile.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/footer.css\">\r\n");
      out.write("<script src=\"js/profile.js\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Online Grocery Store</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("    <nav>\r\n");
      out.write("		<label class=\"logo\">GroceryPro</label>\r\n");
      out.write("		<ul>\r\n");
      out.write("		   <li><a class=\"active\" href=\"sellerhome.jsp\">Home</a></li>\r\n");
      out.write("		   <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("		   <li><a href=\"my items.jsp\">My Items</a></li>\r\n");
      out.write("		   <li>\r\n");
      out.write("			<a href=\"#\">My Account\r\n");
      out.write("				<i class=\"fas fa-caret-down\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"additems.jsp\">Add Items</a></li>\r\n");
      out.write("				<li><a href=\"profile.jsp\">Profile</a></li>\r\n");
      out.write("				<li><a href=\"login.jsp\">Log Out</a></li>\r\n");
      out.write("				<li>\r\n");
      out.write("			</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li><a href=\"#\">Feedback</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	 </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<img src=\"pic/pro.jpg\" style=\"width:500px;margin-top:80px;margin-left:800px;\">\r\n");

	Userlog user= new Userlog();
	String username=(String)session.getAttribute("username");
	Userdatadb udb = new Userdatadb();
	user=udb.Retrive(username);

      out.write("\r\n");
      out.write(" <div align=\"center\" class=\"login-form\">\r\n");
      out.write("  <form>\r\n");
      out.write("   <h1 class=\"ha1\">Seller Profile</h1>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"txtb\">\r\n");
      out.write("		 	<label ><b>Shop Name: </b>");
 out.print(user.getName()); 
      out.write("</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"txtb\">\r\n");
      out.write("			<label ><b>Email: </b>");
 out.print(user.getemail()); 
      out.write("</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"txtb\">\r\n");
      out.write("			<label ><b>Phone: </b>");
 out.print(user.getPhone()); 
      out.write("</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<input type=\"button\" class=\"logbtn\" value=\"Change My Password\" onclick=\"page1()\">\r\n");
      out.write("		\r\n");
      out.write("		<input type=\"button\" class=\"logbtn\" value=\"Delete  My Account\" name=\"delete\" onclick=\"page2()\">\r\n");
      out.write(" </form>\r\n");
      out.write(" </div>\r\n");
      out.write("  <footer class=\"footer\" style=\"margin-top: 100px;\">\r\n");
      out.write("  	 <div class=\"container\">\r\n");
      out.write("  	 	<div class=\"row\">\r\n");
      out.write("  	 		<div class=\"footer-col\">\r\n");
      out.write("  	 			<h4>company</h4>\r\n");
      out.write("  	 			<ul>\r\n");
      out.write("  	 				<li><a href=\"#\">about us</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">our services</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">privacy policy</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">affiliate program</a></li>\r\n");
      out.write("  	 			</ul>\r\n");
      out.write("  	 		</div>\r\n");
      out.write("  	 		<div class=\"footer-col\">\r\n");
      out.write("  	 			<h4>get help</h4>\r\n");
      out.write("  	 			<ul>\r\n");
      out.write("  	 				<li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">shipping</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">returns</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">order status</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">payment options</a></li>\r\n");
      out.write("  	 			</ul>\r\n");
      out.write("  	 		</div>\r\n");
      out.write("  	 		<div class=\"footer-col\">\r\n");
      out.write("  	 			<h4>online shop</h4>\r\n");
      out.write("  	 			<ul>\r\n");
      out.write("  	 				<li><a href=\"#\">watch</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">bag</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">shoes</a></li>\r\n");
      out.write("  	 				<li><a href=\"#\">dress</a></li>\r\n");
      out.write("  	 			</ul>\r\n");
      out.write("  	 		</div>\r\n");
      out.write("  	 		<div class=\"footer-col\">\r\n");
      out.write("  	 			<h4>About us</h4>\r\n");
      out.write("  	 				<p class=\"par\">Welcome to Sri Lanka's first inspirational global experience in online grocery retailing. Be a part of this experience, redefining convenience and freshness.</p>\r\n");
      out.write("  	 			</div>\r\n");
      out.write("  	 		</div>\r\n");
      out.write("  	 	</div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
