job('Selenium Test Job') {
    scm {
        git('https://github.com/mizuochi-hikaru/selenium-test.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@example.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS 13.7.0')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
