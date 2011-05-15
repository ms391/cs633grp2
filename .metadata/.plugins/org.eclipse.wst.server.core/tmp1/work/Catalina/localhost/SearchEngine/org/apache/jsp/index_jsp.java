package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import org.bu.cs633.grp2.search.Searcher;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(1);
    _jspx_dependants.add("/search_header.inc");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Welcome to search</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".searchform {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tzoom: 1; /* ie7 hack for display:inline-block */\r\n");
      out.write("\t*display: inline;\r\n");
      out.write("\tborder: solid 1px #d2d2d2;\r\n");
      out.write("\tpadding: 3px 5px;\r\n");
      out.write("\t\r\n");
      out.write("\t-webkit-border-radius: 2em;\r\n");
      out.write("\t-moz-border-radius: 2em;\r\n");
      out.write("\tborder-radius: 2em;\r\n");
      out.write("\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 0px rgba(0,0,0,.1);\r\n");
      out.write("\t-moz-box-shadow: 0 1px 0px rgba(0,0,0,.1);\r\n");
      out.write("\tbox-shadow: 0 1px 0px rgba(0,0,0,.1);\r\n");
      out.write("\r\n");
      out.write("\tbackground: #f1f1f1;\r\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#ededed));\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  #fff,  #ededed);\r\n");
      out.write("\tfilter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffff', endColorstr='#ededed'); /* ie7 */\r\n");
      out.write("\t-ms-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffff', endColorstr='#ededed'); /* ie8 */\r\n");
      out.write("}\r\n");
      out.write(".searchform input {\r\n");
      out.write("\tfont: normal 12px/100% Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".searchform .searchfield {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tpadding: 6px 6px 6px 8px;\r\n");
      out.write("\twidth: 202px;\r\n");
      out.write("\tborder: solid 1px #bcbbbb;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\r\n");
      out.write("\t-webkit-border-radius: 2em;\r\n");
      out.write("\t-moz-border-radius: 2em;\r\n");
      out.write("\tborder-radius: 2em;\r\n");
      out.write("\r\n");
      out.write("\t-moz-box-shadow: inset 0 1px 2px rgba(0,0,0,.2);\r\n");
      out.write("\t-webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,.2);\r\n");
      out.write("\tbox-shadow: inset 0 1px 2px rgba(0,0,0,.2);\r\n");
      out.write("}\r\n");
      out.write(".searchform .searchbutton {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tborder: solid 1px #494949;\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\theight: 27px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\ttext-shadow: 0 1px 1px rgba(0,0,0,.6);\r\n");
      out.write("\r\n");
      out.write("\t-webkit-border-radius: 2em;\r\n");
      out.write("\t-moz-border-radius: 2em;\r\n");
      out.write("\tborder-radius: 2em;\r\n");
      out.write("\r\n");
      out.write("\tbackground: #5f5f5f;\r\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, from(#9e9e9e), to(#454545));\r\n");
      out.write("\tbackground: -moz-linear-gradient(top,  #9e9e9e,  #454545);\r\n");
      out.write("\tfilter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#9e9e9e', endColorstr='#454545'); /* ie7 */\r\n");
      out.write("\t-ms-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#9e9e9e', endColorstr='#454545'); /* ie8 */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<header style=\"text-align=center;\">\r\n");
      out.write("\t<h1>Logo</h1>\r\n");
      out.write("\t<form class=\"searchform\" role=\"search\">\r\n");
      out.write("\t\t<input class=\"searchfield\" name=\"search\" type=\"text\" value=\"Search...\" onfocus=\"if (this.value == 'Search...') {this.value = '';}\" onblur=\"if (this.value == '') {this.value = 'Search...';}\" />\r\n");
      out.write("\t\t<input class=\"searchbutton\" type=\"submit\" value=\"Go\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<p><small>Search for site www.cashmerefire.com</small></p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</header>\r\n");
      out.write('\r');
      out.write('\n');
 if (request.getParameter("search") != null) { 
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<hr />\r\n");
      out.write("<section style=\"text-align=center;\">\r\n");
      out.write("\t<h1>Search results for \"");
      out.print( request.getParameter("search") );
      out.write("\"</h1>\r\n");
      out.write("\t");
 Searcher s = Searcher.getInstance();
	   Map<String, Integer> results = s.search(request.getParameter("search"));
	   
	   for(String key : results.keySet())
	   {
			
      out.write("<p><a href=\"");
      out.print( key );
      out.write('"');
      out.write('>');
      out.print( results.get(key) );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( key );
      out.write("</a></p>");

	   }
	
      out.write("\r\n");
      out.write("</section>\r\n");
 } 
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
