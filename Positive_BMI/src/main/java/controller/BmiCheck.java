package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.BmiBeans;
import model.BmiCalc;


@WebServlet("/BmiCheck")
public class BmiCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	//診断画面にフォワード
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/BmiCheck.jsp");
			dispatcher.forward(request, response);
	}
	
	//FORMからリクエストパラメータ値を受け取る
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
	//リクエストパラメータ値をBmiBeansのプロパティに設定する
		BmiBeans bb = new BmiBeans();
		
		bb.setName(name);
		bb.setHeight(Double.parseDouble(height));
		bb.setWeight(Double.parseDouble(weight));
		
	//BmiCalcにてBMI数値の計算、体型の結果を設定
		
		BmiCalc bmiCalc = new BmiCalc();
		bmiCalc.execute(bb);
		
	//リクエストスコープに保存
		request.setAttribute("bb", bb);
		
	//診断結果にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/BmiCheckResult.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
