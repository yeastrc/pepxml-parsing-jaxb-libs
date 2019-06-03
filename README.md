###PepXML JAXB Build Process###

1. Edit PepXML schema file (e.g., pepXML_v120.xsd)

Find and remove the line in red:

```
<xs:sequence>
<xs:any namespace="##any" processContents="lax" minOccurs="0">
		<xs:annotation>
			<xs:documentation>Wildcard for summary info customized for a particular analysis</xs:documentation>
		</xs:annotation>
	</xs:any>
	<xs:element name="parameter" type="nameValueType" minOccurs="0" maxOccurs="unbounded"/> THIS ONE
</xs:sequence>
```

Change:

```
<xs:element name="msms_pipeline_analysis">
	<xs:complexType>
		<xs:sequence maxOccurs="unbounded">
```
To:

```
<xs:element name="msms_pipeline_analysis">
	<xs:complexType>
		<xs:sequence>
```


Find and replace all xs:float with xs:decimal. E.g., 

```
<xs:attribute name="mass" type="xs:float" use="required"/>
```

Becomes

```
<xs:attribute name="mass" type="xs:decimal" use="required"/>
```

2. Edit PepXML schema file (e.g., pepXML_v120.xsd)

Ensure you have a site-template.xjb file containing the following:

```
<bindings xmlns="http://java.sun.com/xml/ns/jaxb"
          xmlns:xsi="http://www.w3.org/2000/10/XMLSchema-instance"
          xmlns:xs="http://www.w3.org/2001/XMLSchema"
          version="2.1">
    <bindings schemaLocation="pepXML_v120.xsd" version="1.20">
        <!-- rename the value element -->
        <bindings node="//xs:complexType[@name='nameValueType']">
            <bindings node=".//xs:attribute[@name='value']">
                <property name="ValueAttribute"/>
            </bindings>
        </bindings>
    </bindings>
</bindings>
```

Run the following command in the same directory as the XSD and XJB file:

"c:\path\to\jdk\bin\xjc.exe" -b site-template.xjb pepXML_v120.xsd

