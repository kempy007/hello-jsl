package org.kempy

class webhook {
  def msg()
  {
     curl -H "Content-Type: application/json" -d "{\"text\": \"Hello World\"}" 'https://outlook.office.com/webhook/5de55542-4e21-4d48-9ea6-79f2c1fd3ef4@b945c813-dce6-41f8-8457-5a12c2fe15bf/IncomingWebhook/c545cc08906c4641ab6d879617cc5e1d/e151c1d1-ff94-48ce-96f1-9af1c39b9f45'
     return "Webhook sent"
  }

}
