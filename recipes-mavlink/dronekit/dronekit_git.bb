SUMMARY = "dronekit"
HOMEPAGE = "https://github.com/dronekit/dronekit-python"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2794c0df5b907fdace235a619d80314"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/dronekit/dronekit-python"

PV = "${SRCPV}"
S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python-pyserial \
                   pymavlink \
                   python-pyparsing \
                  "
