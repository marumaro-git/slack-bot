package com.example.demo;

import com.slack.api.bolt.App;
import com.slack.api.bolt.jakarta_servlet.SlackAppServlet;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/slack/events")
public class SlackBotController extends SlackAppServlet {
  public SlackBotController(App app) {
    super(app);
  }
}