 
listView('kolejne_podkreslniki Jobs') {
    description('kolejne_podkreslniki Jobs')
    jobs {
        regex('kolejne_podkreslniki_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
