package com.pickshell.freemarker.basic

class OperationSystem {

    private String name
    private String developer

    OperationSystem(String name, String developer) {
        this.name = name
        this.developer = developer
    }

    String getName() {
        return name
    }

    String getDeveloper() {
        return developer
    }

}
