package code.snippet
import scala.xml._
import net.liftweb._
import http._
import common._
import util.Helpers._
import util.ClearClearable
import js.JsCmds._
import js.JsCmd
import js.jquery.JqJsCmds._
import SHtml._
import mapper.By 
import util.FieldError

class Projects {
	private object name extends RequestVar("")
	private object desc extends RequestVar("")
	private object key extends RequestVar("")
	
	def add() = {
		"name=project_name" #> textElem(name) &
		"name=project_key" #> textElem(key) &
		"name=project_desc" #> (textareaElem(desc) ++ SHtml.hidden(addProject)) 
	}
	
	def addProject() = {
		if(name.length < 3) S.error("project_name", "name too short")
		if(key.length <3) S.error("project_key", "project key too short")
	}
}