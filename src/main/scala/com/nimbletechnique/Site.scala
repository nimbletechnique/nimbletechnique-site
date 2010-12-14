package com.nimbletechnique

import org.scalatra.ScalatraServlet

/**
 * Created by IntelliJ IDEA.
 * User: collin
 * Date: Dec 13, 2010
 * Time: 8:59:21 PM
 * To change this template use File | Settings | File Templates.
 */

class Site extends ScalatraServlet {

  before {
    contentType = "text/html"
  }

  get("/") {
    <h1>Hello world!</h1>
  }

}
