package com.langthang.controller.web;

import  com.langthang.dao.ICategoriesDao;
import com.langthang.model.categoriesModel;
import com.langthang.model.newsModel;
import com.langthang.service.ICategoriesService;
import com.langthang.service.INewsService;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = -178674350167896329L;
	@Inject
	INewsService newsService;
	@Inject
	ICategoriesService categoriesService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = 6L;
		newsService.delete(id);
		request.setAttribute("categories", categoriesService.findAll());
		request.setAttribute("news", newsService.findByCategoryId(1L));
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

}
