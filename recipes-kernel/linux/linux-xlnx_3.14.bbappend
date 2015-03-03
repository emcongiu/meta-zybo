FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append += " \
		file://dglt-common;type=kmeta;destsuffix=dglt-common \
		"

KERNEL_FEATURES_append_zybo-zynq7 += "bsp/zybo-zynq7.scc"