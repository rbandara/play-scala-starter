package controllers

import play.api.mvc.{Action, Controller}

object MyController extends Controller {
  def index = Action {
    Ok("this is another end point")
  }
}
