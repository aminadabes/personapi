provider "local" {}

# Start a container
resource "docker_container" "application" {
  image    = "${docker_image.application.latest}"
  must_run = true
  name     = "application"

  ports {
    internal = 8080
    external = 8080
  }
}

# Find the latest Ubuntu precise image.
resource "docker_image" "application" {
  name = "phpmyadmin/phpmyadmin"
}

terraform {
  required_providers {
    docker = {
      source = "kreuzwerker/docker"
    }
    local = {
      source = "hashicorp/local"
    }
  }
  required_version = ">= 0.11.8"
}
