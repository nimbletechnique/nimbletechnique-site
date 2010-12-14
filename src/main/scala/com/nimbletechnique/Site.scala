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

  get("/") {
    templateEngine.layout("/WEB-INF/index.scaml", Map("content" -> "hi there!"))
  }

  protected def contextPath = request.getContextPath
  
}
