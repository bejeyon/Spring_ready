package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opt = request.getParameter("opt");
		
		/*
		int result = 0;
		
		if (opt.equals("+")) {
			result = num1 + num2;
		} else if (opt.equals("-")) {
			result = num1 - num2;
		} else if (opt.equals("*")) {
			result = num1 * num2;
		} else if (opt.equals("/")) {
			result = num1 / num2;
		}
		*/
		ICalc calc = new CalcSvc(num1, num2, opt);
		int result = calc.getResult();
		
		CalcVo vo = new CalcVo();
		vo.setNum1(num1);
		vo.setNum2(num2);
		vo.setOpt(opt);
		
		CalcSvc calc2 = new CalcSvc(vo);
		vo = calc2.getResultVO();
		
		result = vo.getResult();
		/*
		response.setContentType("text/html;charset=utf-8");
		response.getWriter()
		.append("<html><head></head><body>")
		.append("결과:" + num1 + opt + num2 + "=" + result)
		.append("</body></html>");
		*/
		
		RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
		request.setAttribute("result", result);
		rd.forward(request, response);
	}

}
