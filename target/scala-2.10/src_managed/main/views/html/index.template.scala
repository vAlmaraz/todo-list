
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

    """),format.raw/*4.1*/("""
    """),_display_(Seq[Any](/*5.6*/main("Todo list")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

        <h1>"""),_display_(Seq[Any](/*7.14*/tasks/*7.19*/.size)),format.raw/*7.24*/(""" task(s)</h1>

        <ul>
        """),_display_(Seq[Any](/*10.10*/tasks/*10.15*/.map/*10.19*/ { task =>_display_(Seq[Any](format.raw/*10.29*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/task/*12.22*/.description)),format.raw/*12.34*/("""

                """),_display_(Seq[Any](/*14.18*/form(routes.Application.deleteTask(task.id))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
                    <input type="submit" value="Delete">
                    """)))})),format.raw/*16.22*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
        </ul>

        <h2>Create a new task</h2>

        """),_display_(Seq[Any](/*23.10*/form(routes.Application.newTask)/*23.42*/ {_display_(Seq[Any](format.raw/*23.44*/("""

            """),_display_(Seq[Any](/*25.14*/inputText(taskForm("description")))),format.raw/*25.48*/("""

            <input type="submit" value="Create">
        """)))})),format.raw/*28.10*/("""

    """)))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[String]): play.api.templates.Html = apply(tasks,taskForm)
    
    def f:((List[Task],Form[String]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 16 09:51:45 CET 2013
                    SOURCE: /Users/mimo/Documents/play215/todo-list/app/views/index.scala.html
                    HASH: e7c3d9e1d0021778ef1cabe696b07817dfcd394f
                    MATRIX: 522->1|658->44|690->67|730->73|755->90|794->92|844->107|857->112|883->117|956->154|970->159|983->163|1031->173|1102->208|1115->212|1149->224|1204->243|1257->287|1297->289|1408->368|1468->396|1565->457|1606->489|1646->491|1697->506|1753->540|1845->600
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|33->12|33->12|33->12|35->14|35->14|35->14|37->16|39->18|44->23|44->23|44->23|46->25|46->25|49->28
                    -- GENERATED --
                */
            