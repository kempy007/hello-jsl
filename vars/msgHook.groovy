#!groovy
import org.kempy.webhook

def call() {
    def wh = new webhook()
    wh.msg()
    echo "We did it!"
}
