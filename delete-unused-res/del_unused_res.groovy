

// ===================== 1. set basic argumetns =====================
projectPath = 'E:/workspace/mine/SixTools'


// ===================== 2. main entrance =====================
// TODO mac is different
// TODO "app" module can be changed

// def commandLint = "cmd /c gradlew.bat :app:lintDebug > a.txt" 
// commandLint.execute(null, new File(projectPath))


lintResultXmlFile = "C:/Users/songz2/temp/lint-results-temp.xml"

def axml = new XmlParser().parse(lintResultXmlFile)

axml.issue.each {
    println ("- - - - - - - - - - - - ")
    println "type = ${it.@id}"
    println it.@message
    println it.location.@file
}



// ===================== 3. run lint =====================



// ===================== 2. delete unused res =====================



