 
listView('MavenReadme Jobs') {
    description('MavenReadme Jobs')
    jobs {
        regex('MavenReadme_.+')
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
