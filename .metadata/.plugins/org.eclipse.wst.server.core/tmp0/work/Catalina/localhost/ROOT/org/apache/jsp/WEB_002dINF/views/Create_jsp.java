/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-02-01 07:05:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/82103/바탕%20화면/sportproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SportProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/82103/바탕%20화면/sportproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SportProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1610166318252L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../CSS/CreateUserCss.css\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write(" <script>\r\n");
      out.write("//아이디 유효성 검사(1 = 중복 / 0 != 중복)\r\n");
      out.write("var idck = 0;\r\n");
      out.write("$(function() {\r\n");
      out.write("  $(\"#idcheck\").click(function () {\r\n");
      out.write("\t\tvar id = $('#id').val();\r\n");
      out.write("\t\tvar idJ = /^[a-z0-9]{4,12}$/;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync: true,\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tdata : id,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/idcheck\",\r\n");
      out.write("\t\t\t dataType : \"json\",\r\n");
      out.write("\t\t\t contentType: \"application/json; charset=UTF-8\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(\"1 = 중복o / 0 = 중복x : \"+ data);\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (data > 0) {\r\n");
      out.write("\t\t\t\t\t\t// 1 : 아이디가 중복되는 문구\r\n");
      out.write("\t\t\t\t\t\t$(\"#id_check\").text(\"사용중인 아이디입니다\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#id_check\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#reg_submit\").attr(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t\tidck = 0;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(idJ.test(id)){\r\n");
      out.write("\t\t\t\t\t\t\t// 0 : 아이디 길이 / 문자열 검사\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#id_check\").text(\"사용가능한 아이디 입니다\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#reg_submit\").attr(\"disabled\", false);\r\n");
      out.write("\t\t\t\t\t\t\tidck = 1;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#id\").attr(\"readonly\",true);\r\n");
      out.write("\t\t\t\t\t\t} else if(id == \"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').text('아이디를 입력해주세요 ');\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').css('color', 'red');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#reg_submit\").attr(\"disabled\", true);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tidck = 0;\r\n");
      out.write("\t\t\t\t\t\t} else if(id == null){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').text('아이디를 입력해주세요 ');\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').css('color', 'red');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#reg_submit\").attr(\"disabled\", true);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tidck = 0;\r\n");
      out.write("\t\t\t\t\t\t}\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').text(\"아이디는 소문자와 숫자 4~12자리만 가능합니다 \");\r\n");
      out.write("\t\t\t\t\t\t\t$('#id_check').css('color', 'red');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#reg_submit\").attr(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t\t\tidck = 0;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},  error:function(request,status,error){\r\n");
      out.write("\t\t\t        alert(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error:\"+error);\r\n");
      out.write("\t\t\t        alert (\"아이디를 입력해주세요\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(function() {\r\n");
      out.write("\t  $(\"#resetid\").click(function () {\r\n");
      out.write("\t\t  $(\"#id\").attr(\"readonly\",false);\r\n");
      out.write("\t\t idck=0;\r\n");
      out.write("\t  });\r\n");
      out.write("\t  });\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\"> -->\r\n");
      out.write("function nullCheck() {\r\n");
      out.write("\tvar id = document.getElementById('id').value;\r\n");
      out.write("\t//var idcheck = document.form.getElementById('id');\r\n");
      out.write("\tvar pw = document.getElementById('pw').value;\r\n");
      out.write("\tvar pw2 = document.getElementById('pw2').value;\r\n");
      out.write("\tvar name = document.getElementById('name').value;\r\n");
      out.write("\tvar birth = document.getElementById('birth').value;\r\n");
      out.write("\tvar eamil = document.getElementById('email').value;\r\n");
      out.write("\tvar phone = document.getElementById('phone').value;\r\n");
      out.write("\tvar male = document.getElementById('male').value;\r\n");
      out.write("\tvar female = document.getElementById('female').value;\r\n");
      out.write("\tvar secret = document.getElementById('secret').value;\r\n");
      out.write("\tvar address1 = document.form.address1.value;\r\n");
      out.write("\tvar address2 = document.form.address2.value;\r\n");
      out.write("\tvar man = document.querySelector('input[name=\"man\"]:checked').value;\r\n");
      out.write("\tif (pw == \"\") {\r\n");
      out.write("\t\talert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.pw.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.pw.value.indexOf(\" \") >= 0) {\r\n");
      out.write("\t\talert(\"비밀번호에 공백을 사용할 수 없습니다.\")\r\n");
      out.write("\t\tdocument.form.pw.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.pw.value.length<4 || document.form.pw.value.length>12) {\r\n");
      out.write("\t\talert(\"비밀번호를 4~12자까지 입력해주세요.\")\r\n");
      out.write("\t\tdocument.form.pw.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (pw != pw2) {\r\n");
      out.write("\t\talert(\"비밀번호가 일치하지 않습니다\");\r\n");
      out.write("\t\tdocument.form.pw2.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (name == \"\") {\r\n");
      out.write("\t\talert(\"이름을 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.name.value.indexOf(\" \") >= 0) {\r\n");
      out.write("\t\talert(\"이름에 공백을 사용할 수 없습니다.\")\r\n");
      out.write("\t\tdocument.form.name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (email == \"\") {\r\n");
      out.write("\t\talert(\"이메일을 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.email.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.email.value.indexOf(\" \") >= 0) {\r\n");
      out.write("\t\talert(\"이메일에 공백을 사용할 수 없습니다.\")\r\n");
      out.write("\t\tdocument.form.email.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (birth == \"\") {\r\n");
      out.write("\t\talert(\"생일을 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.date.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (phone == \"\") {\r\n");
      out.write("\t\talert(\"전화번호를 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.phone.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (isNaN(phone)) {\r\n");
      out.write("\t\talert(\"전화번호는 숫자만 입력 가능합니다\");\r\n");
      out.write("\t\tdocument.form.phone.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.phone.value.indexOf(\" \") >= 0) {\r\n");
      out.write("\t\talert(\"전화번호에 공백을 사용할 수 없습니다.\")\r\n");
      out.write("\t\tdocument.form.phone.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.form.phone.value.length<10 || document.form.phone.value.length>12) {\r\n");
      out.write("\t\talert(\"전화번호를 10~12자까지 입력해주세요.\")\r\n");
      out.write("\t\tdocument.form.phone.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (address1 == \"\") {\r\n");
      out.write("\t\talert(\"주소를 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.address1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (address2 == \"\") {\r\n");
      out.write("\t\talert(\"상세주소를 입력해주세요\");\r\n");
      out.write("\t\tdocument.form.address2.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (idck == 0) {\r\n");
      out.write("\t\talert(\"아이디 중복체크를 해주세요\")\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.form.submit();\r\n");
      out.write("\t/* var left = Math.ceil(((window.screen.width)/2)-100);\r\n");
      out.write("\tvar top = Math.ceil(((window.screen.height)/2)-50); \r\n");
      out.write("\twindow.open('checkcreate.jsp','', 'width=300, height=100, width='+ left + ', top=' + top); */\r\n");
      out.write("}\r\n");
      out.write("function post() {\r\n");
      out.write("\tvar url = \"/post/postsearchpage\";\r\n");
      out.write("\twindow.open(url, \"post\",\r\n");
      out.write("\t\t\t\"toorbar=no, menubar=no, scrollbars=yes, resizable=no,\"\r\n");
      out.write("\t\t\t\t\t+ \"width=500, height=300, top=300, left=300 \");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headermenu.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<p class=\"create\" align=\"center\">회원가입</p>\r\n");
      out.write("\t\t<form class=\"form\" name=\"form\" action=\"/user/insert\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<p class=\"abc\"><label for=\"id\">아이디</label></p>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"id\" id=\"id\" name=\"id\" placeholder=\"ID\" size=\"10\" maxlength=\"20\">\r\n");
      out.write("\t\t\t<input type=\"button\" name=\"idcheck\" id=\"idcheck\" class=\"idcheck\" value=\"중복체크\">\r\n");
      out.write("\t\t\t<input type=\"button\" name=\"resetid\" id=\"resetid\" class=\"resetid\" value=\"새로운 아이디\">\r\n");
      out.write("\t\t\t<br> \r\n");
      out.write("\t\t\t<div class=\"check_font\" id=\"id_check\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p class=\"abc\">비밀번호</p>\r\n");
      out.write("\t\t\t<br> <input type=\"password\" class=\"pw\" id='pw' name=\"pw\" size=\"10\" maxlength=\"20\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">비밀번호 확인</p>\r\n");
      out.write("\t\t\t<br> \r\n");
      out.write("\t\t\t<input type=\"password\" class=\"pw2\" id='pw2' name=\"pw2\" size=\"10\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">이름</p>\r\n");
      out.write("\t\t\t<br> <input type=\"text\" class=\"name\" id='name' name=\"name\" size=\"10\" maxlength=\"20\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">생년월일</p>\r\n");
      out.write("\t\t\t<br> <input type=\"date\" class=\"birth\" id='birth' name='birth' size=\"10\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">이메일</p>\r\n");
      out.write("\t\t\t<br> \r\n");
      out.write("\t\t\t<input type=\"text\" class=\"email\" id='email' name='email' size=\"10\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">성별</p>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div class=\"man\">\r\n");
      out.write("\t\t\t\t남자<input type=\"radio\" name=\"man\" id='male' value=\"남자\" size=\"10\" checked> \r\n");
      out.write("\t\t\t\t여자<input type=\"radio\" name=\"man\" id='female' value=\"여자\" size=\"10\"> \r\n");
      out.write("\t\t\t\t비공개<input type=\"radio\" name=\"man\" id='secret' value=\"비공개\" size=\"10\"><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p class=\"abc\">전화번호</p>\r\n");
      out.write("\t\t\t<br> <input type=\"text\" class=\"phone\" id='phone'\r\n");
      out.write("\t\t\t\tname=\"phone\" size=\"10\" maxlength=\"20\"><br>\r\n");
      out.write("\t\t\t<p class=\"abc\">주소</p>\r\n");
      out.write("\t\t\t<br> <input type=\"text\" class=\"address1\" name=\"address1\"\r\n");
      out.write("\t\t\t\tmaxlength=\"30\"><a class=\"helf\" onclick=\"post()\">주소검색</a>\r\n");
      out.write("\t\t\t<p class=\"abc\">상세주소</p>\r\n");
      out.write("\t\t\t<br> <input type=\"text\" class=\"address2\" name=\"address2\"\r\n");
      out.write("\t\t\t\tmaxlength=\"30\"><br> <a class=\"button2\"\r\n");
      out.write("\t\t\t\tonclick=\"nullCheck();\" align=\"center\">회원가입</a><br> <br> <a\r\n");
      out.write("\t\t\t\tclass=\"button2\" onclick=\"window.history.back();\">취소</a>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>");
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