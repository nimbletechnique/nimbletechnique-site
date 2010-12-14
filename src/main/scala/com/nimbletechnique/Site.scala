package com.nimbletechnique

import org.scalatra._
import org.scalatra.ScalatraServlet
import scalate.ScalateSupport

/**
 * Created by IntelliJ IDEA.
 * User: collin
 * Date: Dec 13, 2010
 * Time: 8:59:21 PM
 * To change this template use File | Settings | File Templates.
 */

class Site extends ScalatraServlet with ScalateSupport {

  before {
    contentType = "text/html"
  }

  get("/")        { render("/WEB-INF/index.scaml") }
  get("/contact") { render("/WEB-INF/contact.scaml") }
  get("/about")   { render("/WEB-INF/about.scaml") }
  get("/work")    { render("/WEB-INF/work.scaml") }

  protected def contextPath = request.getContextPath

  private def render(path: String, params:(String,String)*) = {
    templateEngine.layout(path, params.toMap)
  }
}
