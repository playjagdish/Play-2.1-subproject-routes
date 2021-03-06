package controllers

import play.api._
import play.api.mvc._

import subproject.lib._
object Subproject extends Controller {
  
  def index = Action {
    Ok(views.html.index("Play 2.1 - Sub Module with routes example."))
  }

  def foo = Action {
    Ok("Foo")
  }
  
  def bar = Action { 
    Ok(Bar.bar())
  }
}
