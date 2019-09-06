#!groovy
import org.kempy.randomName

def call(String name = 'world') {
    def rndName = new randomName()
    def name = rndName.who()
    echo "Hello there, ${name}!"
}
