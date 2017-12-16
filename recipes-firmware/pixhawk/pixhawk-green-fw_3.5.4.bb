SUMMARY = "Pixhawk firmware binary"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${THISDIR}/files/COPYING.txt;md5=d32239bcb673463ab874e80d47fae504"
firmwaredir = "/firmware/green"
FILES_${PN} += "${firmwaredir}/"
REPO_NAME = "ardupilot-solo"
#REPO_TAG = "solo-${PV}"
REPO_TAG = "solo-master"
FILE_EXT = "px4"
FILE_SRC = "ArduCopter-v3.${FILE_EXT}"
FILE_DST = "ArduCopter-v3_${PV}.${FILE_EXT}"

do_fetch () {

    wget http://firmware.ap.ardupilot.org/Copter/stable/PX4/ArduCopter-v3.px4 -O ${WORKDIR}/${FILE_SRC}
}

do_install () {
    install -d ${D}${firmwaredir}
    install -m 0644 ${WORKDIR}/${FILE_SRC} ${D}${firmwaredir}/${FILE_DST}
}
