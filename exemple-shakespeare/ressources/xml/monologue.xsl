<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text" />
	<xsl:template match="/">
		<xsl:for-each select="//SPEECH/LINE[name(preceding-sibling::*[1])='SPEAKER' or name(preceding-sibling::*[1])='LINE']">
			<xsl:value-of select="."/><xsl:text>&#xA;</xsl:text>
		</xsl:for-each>
    </xsl:template>
</xsl:stylesheet> 