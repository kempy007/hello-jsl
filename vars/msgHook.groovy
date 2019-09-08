#!groovy
import org.kempy.webhook

def call() {
    def wh = new webhook(this)
    wh.msg()
    echo "We did it!"
}
