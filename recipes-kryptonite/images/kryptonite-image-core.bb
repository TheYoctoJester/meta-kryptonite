DESCRIPTION = "A console-only image with more full-featured Linux system \
functionality installed."

IMAGE_FEATURES += ""

IMAGE_INSTALL = "\
    os-release \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image
