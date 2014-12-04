package grails.plugins.mail.visualization

class ApplicationEmail {
	
	String name
	String path
	
    static constraints = {
		name nullable:false, blank:false
		path nullable:false, blank:false
    }
}
