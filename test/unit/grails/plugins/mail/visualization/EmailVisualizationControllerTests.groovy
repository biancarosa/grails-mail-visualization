package grails.plugins.mail.visualization



import grails.buildtestdata.mixin.Build
import grails.test.mixin.*

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EmailVisualizationController)
@Mock(ApplicationEmail)
@Build([ApplicationEmail])
class EmailVisualizationControllerTests {

    void testIndexWithoutId() {
		controller.index()
		
		assert controller.modelAndView.viewName == '/emailVisualization/notFound'
    }
	
	void testIndexWithInvalidId() {
		params.id = 'ABC'
		
		controller.index()
		
		assert controller.modelAndView.viewName == '/emailVisualization/notFound'
	}
	
	void testIndexWithValidId() {
		def email = ApplicationEmail.build(name: 'testMail', path: '/emailVisualization/email')
		params.id = email.name
		
		controller.index()
		
		assert controller.modelAndView.viewName == '/emailVisualization/email'
	}
}
