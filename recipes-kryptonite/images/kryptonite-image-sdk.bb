DESCRIPTION = "A console-only image with more full-featured Linux system \
functionality and dev tools installed."

require kryptonite-image-core.bb

# dbg-pkgs
# dev-pkgs
# tools-profile 

IMAGE_FEATURES += " \
	dbg-pkgs \
	dev-pkgs \
	tools-sdk \
	tools-debug \
"
