pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url =
                uri("https://klap-dev-533267230853.d.codeartifact.us-east-2.amazonaws.com/maven/klap-dev/")
            credentials {
                username = "aws"
                password = System.getenv("CODEARTIFACT_AUTH_TOKEN")
            }
        }
    }
}

rootProject.name = "Klap-be"
include(":app")
include(":be")
