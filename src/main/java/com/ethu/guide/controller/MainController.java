package com.ethu.guide.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author truonga Main Controller of the site. Handling URL redirect, logic
 *         between Model and View.
 * 
 *         30 Oct. 2018
 */

public class MainController {
	/*
	 * TODO: Will need to have a logic inside this controller TODO: What will be
	 * shown on Homepage? TODO: Search for a game TODO: Detail Page of a game
	 * TODO:List out all the build (Link to the blog posts from ethugamer.com TODO:
	 * Search for an item TODO: Show info of an item
	 *
	 * 
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/games")
	public String findGames() {
		return "This is the list of games currently covered on this site.";
	}

	@RequestMapping("/ranting")
	public String blog() {
		return "Here is my huble blog started in 2017";
	}
	
	@RequestMapping("/error")
	public String errorPage() {
		return "Oops! You are not suppose to be here...";
	}
}
