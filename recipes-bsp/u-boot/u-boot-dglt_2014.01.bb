include u-boot-xlnx.inc

LIC_FILES_CHKSUM = "file://README;beginline=1;endline=6;md5=157ab8408beab40cd8ce1dc69f702a6c"

# digilent-v2014.1 release
SRCREV = "c29bed918c377d2bc932cbc0a52f885bf4640514"
PV = "v2014.01${DIGILENT_EXTENSION}+git${SRCPV}"

UBOOT_ENV_zc702-zynq7 = "uEnv"
UBOOT_ENV_zedboard-zynq7 = "uEnv"

SRC_URI_append_zc702-zynq7 = " file://ps7_init.h file://ps7_init.c file://uEnv.txt"
SRC_URI_append_zedboard-zynq7 = " file://ps7_init.h file://ps7_init.c file://uEnv.txt"
