package com.pickshell.freemarker.basic

import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import org.junit.Test

class MainTest {

    @Test
    void basicTest() {
        // 1. Configure FreeMarker
        //
        // You should do this ONLY ONCE, when your application starts,
        // then reuse the same Configuration object elsewhere.

        Configuration cfg = new Configuration()

        // Where do we load the templates from:
        // from root classpath
        cfg.setClassForTemplateLoading(MainTest.class, "/")


        // Some other recommended settings:
        cfg.setIncompatibleImprovements(new Version(2, 3, 20))
        cfg.setDefaultEncoding("UTF-8")
        cfg.setLocale(Locale.US)
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER)

        // 2. Proccess template(s)
        //
        // You will do this for several times in typical applications.

        // 2.1. Prepare the template input:

        Map<String, Object> input = new HashMap<String, Object>()
        input.put("title", "FreeMarker example")

        input.put("exampleObject", new OperationSystem("Java object", "me"))

        List<OperationSystem> systems = new ArrayList<OperationSystem>()
        systems.add(new OperationSystem("Android", "Google"))
        systems.add(new OperationSystem("iOS States", "Apple"))
        systems.add(new OperationSystem("Ubuntu", "Canonical"))
        systems.add(new OperationSystem("Windows7", "Microsoft"))
        input.put("systems", systems)

        // 2.2. Get the template

        Template template = cfg.getTemplate("helloworld.ftl")

        // 2.3. Generate the output

        // Write output to the console
        Writer consoleWriter = new OutputStreamWriter(System.out)
        template.process(input, consoleWriter)
        // For the sake of example, also write output into a file:
        Writer fileWriter = new FileWriter(new File("build/output.html"))
        try {
            template.process(input, fileWriter)
        } finally {
            fileWriter.close()
        }
    }
}
