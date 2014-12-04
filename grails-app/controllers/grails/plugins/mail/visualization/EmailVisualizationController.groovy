package grails.plugins.mail.visualization

/**
 * EmailVisualizationController
 * 
 * Responsible for showing e-mails in the browser
 * 
 * @author Bianca Rosa
 *
 */
class EmailVisualizationController {
	
	/**
	 * Takes an email name and renders the page
	 * 
	 * @param id - email name to show
	 * @return
	 */
    def index() {
		if (!params.id) {
			render (view: '/emailVisualization/notFound')
			return
		}
	
		def name = params.id
		def applicationEmail = ApplicationEmail.findByName(name)
		
		if (!applicationEmail) {
			render (view: '/emailVisualization/notFound')
			return
		}
		render (view: applicationEmail.path)
	}
}
