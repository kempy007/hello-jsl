#!groovy
import org.kempy.webhook

def call() {
    def wh = new webhook(this)
    node {
        wh.msg()
    }
    echo "We did it!"
}
