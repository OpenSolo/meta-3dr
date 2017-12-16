SUMMARY = "This is a MAVLink ground station written in python."
HOMEPAGE = "http://github.com/ArduPilot/MAVProxy"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=3c34afdc3adf82d2448f12715a255122"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/ArduPilot/MAVProxy"

PV = "${SRCPV}"
S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python-pyserial \
                   pymavlink \
                   python-pyparsing \
                  "
