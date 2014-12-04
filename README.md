grails-mail-visualization
=========================
Plugin that allows you to visualize your application emails in your browser.
The goal is to make e-mail development (front & back-end) faster and easier.

how to use it
=========================
Just create a new ApplicationEmail and access http://yourApplication/emailVisualization/index/MY-EMAIL

You can see the example mail by doing: new ApplicationEmail(name: "MyEmail", path: "/emailVisualization/email")

For now it doesn't render e-mail with models.

what's coming next
=========================
- Models will be easily configured and we will make use of the @Build method from build-test-data plugin to generate objects.


suggestions? wanna be a part of it?
=========================
e-mail me at me@biancarosa.com.br
