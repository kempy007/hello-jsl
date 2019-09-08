package org.kempy

class webhook implements Serializable {
  def steps
  webhook(steps) {this.steps = steps}
  def msg()
  {
    def url = "https://outlook.office.com/webhook/5de55542-4e21-4d48-9ea6-79f2c1fd3ef4@b945c813-dce6-41f8-8457-5a12c2fe15bf/IncomingWebhook/c545cc08906c4641ab6d879617cc5e1d/e151c1d1-ff94-48ce-96f1-9af1c39b9f45"
    def contentType = "\"Content-Type: application/json\""
    def message = "Hello World"
    def jsonWrap = "\"{\"text\": \"${message}\"}\""
    def cmd = "curl -H ${contentType} -d ${jsonWrap} ${url}"
    //steps.sh "ping -c 3 localhost"
    //steps.sh ${cmd}
    steps.sh "curl -H "Content-Type: application/json" -d "{\"text\": \"${message}\"}" ${url}"
     return "Webhook sent"
  }

}
