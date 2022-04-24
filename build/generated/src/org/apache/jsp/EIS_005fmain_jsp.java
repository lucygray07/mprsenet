package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import common.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public final class EIS_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("        <title>EIS Register</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"fevicon.png\" type=\"image/x-icon\">\n");
      out.write("        <style>\n");
      out.write("            .head\n");
      out.write("            {\n");
      out.write("                font: normal normal 15px Verdana, Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("                background-color: #878EFE;\n");
      out.write("                padding: 6px 0px 6px 0px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            .menu1\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                background: #FF5733;\n");
      out.write("                color: white;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .login{\n");
      out.write("                width: 350px;\n");
      out.write("                height: 570px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: 2px black solid;\n");
      out.write("                color:   #566573 ;\n");
      out.write("                background:  #ffffff ;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .data{\n");
      out.write("\n");
      out.write("                font-size: 15px;\n");
      out.write("\n");
      out.write("                margin-left: 20px;\n");
      out.write("                color: black;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 12px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .data1{\n");
      out.write("\n");
      out.write("                font-size: 22px;\n");
      out.write("                font-weight: bold;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .btn1,.btn2\n");
      out.write("            {\n");
      out.write("                width: 120px;\n");
      out.write("                background-color: #F6F6F6;\n");
      out.write("                padding: 6px 0px 6px 0px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .clr1{color: #126D00; border: 1px #126D00 solid;}\n");
      out.write("            .clr2{color: #D30000; border: 1px #D30000 solid;}\n");
      out.write("\n");
      out.write("            .btn1:hover {\n");
      out.write("                background-color:#126D00;\n");
      out.write("                color: #ffffff\n");
      out.write("            }\n");
      out.write("            .btn2:hover {\n");
      out.write("                background-color:#D30000;\n");
      out.write("                color: #ffffff\n");
      out.write("            }\n");
      out.write("            a:link {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color:  #2e00ff ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:visited {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:active {\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            h4{\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                margin-right: 85px;\n");
      out.write("                margin-top: -54px;\n");
      out.write("                margin-bottom: 35px;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color:   #ff6100  ;\n");
      out.write("                padding-top: 6px;\n");
      out.write("            }\n");
      out.write("            div {\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            div.ui-datepicker{\n");
      out.write("                width: 270px;\n");
      out.write("                font-size:13px;\n");
      out.write("                padding-bottom: 0px;\n");
      out.write("                padding-left: -15px;\n");
      out.write("                padding-right: 0px;\n");
      out.write("                padding-top: 0px;\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("                margin-left: 0px;\n");
      out.write("                margin-right: 0px;\n");
      out.write("                margin-top: 0px;\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 0px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            datepicker.select{\n");
      out.write("                padding-bottom: 0px;\n");
      out.write("                padding-left: -15px;\n");
      out.write("                padding-right: 0px;\n");
      out.write("                padding-top: 0px;\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("                margin-left: 0px;\n");
      out.write("                margin-right: 0px;\n");
      out.write("                margin-top: 0px;\n");
      out.write("            }\n");
      out.write("            .dropbtn {\n");
      out.write("                color: blue;\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            #dropbtn {\n");
      out.write("                color: blue;\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .dropdown {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: fixed;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                min-width: 130px;\n");
      out.write("                z-index: 1;\n");
      out.write("                font-size: 12px;\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {background-color: #ddd}\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropbtn {\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            alert{\n");
      out.write("                color: red;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(function() {\n");
      out.write("\n");
      out.write("                $(\".datepicker\").datepicker({\n");
      out.write("                    changeMonth: true,\n");
      out.write("                    changeYear: true,\n");
      out.write("                    yearRange: \"-68:+5\",\n");
      out.write("                    dateFormat: \"dd/mm/yy\"\n");
      out.write("                            /*     monthNamesShort  : fullmonth_array         */\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function wwarning() {\n");
      out.write("                alert(\"Registration is Currently Unavailable. It will be open soon for registration.\")\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            table tr td th\n");
      out.write("            {\n");
      out.write("                border: 1px #2e00ff solid;\n");
      out.write("            }\n");
      out.write("            .login-div\n");
      out.write("            {\n");
      out.write("                border: 1px #2e00ff solid;\n");
      out.write("                width: 70%;\n");
      out.write("                margin: auto;\n");
      out.write("                margin-top: 0px;\n");
      out.write("                min-height: 500px;\n");
      out.write("                box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;\n");
      out.write("            }\n");
      out.write("            .main-login-table\n");
      out.write("            {\n");
      out.write("                width: 85%;\n");
      out.write("                alignment-adjust: central;\n");
      out.write("                font: normal normal 12px Verdana, Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            .td-content\n");
      out.write("            {\n");
      out.write("                padding: 5px 0px 5px 4px;\n");
      out.write("                width: 40%;\n");
      out.write("                font: normal normal 12px Verdana, Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("                text-align: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #tr-data:nth-child(odd)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #tr-data\n");
      out.write("            {\n");
      out.write("                line-height: 30px;\n");
      out.write("            }\n");
      out.write("            .inpt{\n");
      out.write("                width: 80%;\n");
      out.write("                padding: 5px 0px 5px 0px;\n");
      out.write("                border: 1px solid #FA8072;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                width: 90%;\n");
      out.write("                alignment-adjust: central;\n");
      out.write("            }\n");
      out.write("            .td-input\n");
      out.write("            {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #input-error-msg\n");
      out.write("            {\n");
      out.write("                font: normal normal 12px Verdana, Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #C70039;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\" #fdecd9 \" style=\"margin-top: 0px;\">\n");
      out.write("        <div style=\"width: 1000px; margin: auto; border: 1px solid #cacaca; background-color: #ffffff;\">\n");
      out.write("            <div style=\"font-size: 14px;font-family:Verdana;font-weight:bold; background:#ff903a; padding-top: 5px; padding-bottom: 5px; \" align=\"center\">Government of India, Ministry of MSME </div>\n");
      out.write("            <div style=\"font-size: 14px;font-family:Verdana;font-weight:bold; background:  white; padding-top: 5px; padding-bottom: 5px; \" align=\"center\"><font color=\"#990000\"></font>O/o  DCMSME </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("            <div style=\"font-size:14px;font-family:Verdana;font-weight:bold; background:  #64bb64; padding-top: 5px; padding-bottom: 5px; \" align=\"center\" ><font color=\"#990000\">ALL INDIA MSME-DO EMPLOYEE'S INFORMATION SYSTEM </font>\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"login-div\">\n");
      out.write("                <h3 class=\"head\">Employee Registration</h3>\n");
      out.write("                <form name=\"myform\" id=\"myform\" method=\"post\" action=\"EIS_success_register.jsp\" onsubmit=\"return myFunction()\">\n");
      out.write("                    <table align=\"center\" class=\"main-login-table\">\n");
      out.write("                        <tr id=\"tr-data\" class=\"\">                        \n");
      out.write("                            <td class=\"td-content\">1. Full Name <span style=\"color: Red\">*</span>:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\"><input class=\"inpt\" type=\"text\" id=\"name\"  name=\"name\" placeholder=\"Your name..\" onkeypress=\"return warning()\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr id=\"tr-data\">\n");
      out.write("\n");
      out.write("                            <td class=\"td-content\">2. Government Email <span style=\"color: Red\">*</span>:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\"><input class=\"inpt\" type=\"text\" id=\"email\" name=\"email\" placeholder=\"Your email..\" onkeypress=\"return warning()\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr id=\"tr-data\">\n");
      out.write("                            <td class=\"td-content\">3. Designation <span style=\"color: Red\">*</span>:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\">\n");
      out.write("                                <select class=\"inpt\" id=\"curr_post\" name=\"curr_post\" onchange=\"return warning()\">\n");
      out.write("                                    <option value=\"\">Select</option>\n");
      out.write("                                    <option value=\"AIA\">AIA</option>\n");
      out.write("                                    <option value=\"Joint Director\">Joint Director</option>\n");
      out.write("                                    <option value=\"Director\">Director</option>\n");
      out.write("                                    <option value=\"Dy. Director\">Dy. Director</option>\n");
      out.write("                                    <option value=\"Asstt. Director Grade-I\">Asstt. Director Grade-I</option>\n");
      out.write("                                    <option value=\"Asstt. Director Grade-II\">Asstt. Director Grade-II</option>\n");
      out.write("                                    <option value=\"Investigator\">Investigator</option>\n");
      out.write("                                    <option value=\"Office Superitendent\">Office Superintendent</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr id=\"tr-data\">\n");
      out.write("                            <td class=\"td-content\">4. Current office <span style=\"color: Red\">*</span>:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\">\n");
      out.write("                                <select class=\"inpt\" id=\"curr_ofc\" name=\"curr_ofc\" onchange=\"return warning()\">\n");
      out.write("                                    <option value=\"\">Select</option>\n");
      out.write("                                    ");

                                        Connection con1 = null;
                                        ResultSet rs1 = null;
                                        try {
                                            con1 = ConnectionManager.getConnectionDirectForMySQL();
                                            Statement stmt1 = con1.createStatement();
                                            String sql = "select * from eis_branch_list";
                                            rs1 = stmt1.executeQuery(sql);
                                            while (rs1.next()) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rs1.getString("Inst_Name"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("Inst_Name"));
      out.write("</option>\n");
      out.write("                                    ");

                                            }
                                            con1.close();
                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }

                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr id=\"tr-data\">\n");
      out.write("                            <td class=\"td-content\">5. Date of Birth <span style=\"color: Red\">*</span>: </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\"><input class=\"datepicker inpt\" type=\"text\" id=\"dob\" name=\"dob\" placeholder=\"dd/mm/yyyy\" onkeypress=\"return warning()\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr id=\"tr-data\">\n");
      out.write("                            <td class=\"td-content\">6. Mobile <span style=\"color: Red\">*</span>:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"td-input\"><input class=\"inpt\" type=\"number\"id=\"mobile\" name=\"mobile\"  min=\"1000000000\" max=\"9999999999\" maxlength=\"10\" placeholder=\"Your mobile no..\" onkeypress=\"return warning()\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"input-error-msg\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"text-align: center;\" colspan=\"\">\n");
      out.write("                                <input class=\"btn1 clr1\" type=\"submit\" value=\"submit\"/>\n");
      out.write("                                <input class=\"btn2 clr2\" type=\"reset\" value=\"reset form\" onclick=\"myform.reset()\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form> \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div align=\"center\" style=\" width: 100%; height: 90px; background: #f5f1f1 ; border: 1px gray thin;\">\n");
      out.write("                <p style=\"padding-top: 15px;\"> <a onClick=\"openTab(this)\" href=\"http://mpr.dcmsme.gov.in/dcmsme/mprsenet/EIS_Approval_letter.pdf\" ><b>Approval Letter, Sample Forms & Training Details From Session 2012-13 to 2017-18 .</b></a></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function myFunction() {\n");
      out.write("                var name = document.myform.name.value;\n");
      out.write("                var email = document.myform.email.value;\n");
      out.write("                var dob = document.myform.dob.value;\n");
      out.write("                var curr_post = document.myform.curr_post.value;\n");
      out.write("                var curr_ofc = document.myform.curr_ofc.value;\n");
      out.write("                var mobile = document.myform.mobile.value;\n");
      out.write("                var atpos = email.indexOf(\"@\");\n");
      out.write("                var dotpos = email.lastIndexOf(\".\");\n");
      out.write("                \n");
      out.write("                alert(name+email+dob+curr_post+curr_ofc+mobile);\n");
      out.write("\n");
      out.write("                if (name == \"\" || name == null) {\n");
      out.write("                    alert(\"Please enter your name.....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else if (email == \"\" || email == null) {\n");
      out.write("                    alert(\"Please enter your email.....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= email.length) {\n");
      out.write("                    alert(\"Not a valid e-mail address\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else if (mobile == \"\" || mobile == null) {\n");
      out.write("                    alert(\"Please enter your mobile no....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (dob == \"\" || dob == null) {\n");
      out.write("                    alert(\"Please enter Date of Birth.....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else if (curr_post == \"\" || curr_post == null) {\n");
      out.write("                    alert(\"Please select your Designation.....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else if (curr_ofc == \"\" || curr_ofc == null) {\n");
      out.write("                    alert(\"Please select Current Office.....\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    //document.forms[0].action = \"EIS_success_register.jsp\"\n");
      out.write("                    // window.location = \"EIS_success_register.jsp\"\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function amyFunction()\n");
      out.write("            {\n");
      out.write("                alert(\"this window is closed now, maintainance is in progress. Please try later\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
