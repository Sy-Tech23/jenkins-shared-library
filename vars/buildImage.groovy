#!/user/bin/env groovy

import saeed.h.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}
