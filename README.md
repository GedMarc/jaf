# JavaBeans Activation Framework (JAF)

The JavaBeans Activation Framework (JAF) is a standard extension to the
Java platform that lets you take advantage of standard services to:
determine the type of an arbitrary piece of data; encapsulate access to
it; discover the operations available on it; and instantiate the
appropriate bean to perform the operation(s).

JAF is used by [JavaMail](https://github.com/eclipse-ee4j/javamail)
and [JAX-WS](https://github.com/eclipse-ee4j/jax-ws-api) for data content
handling.

JAF is included in Java SE 6 through Java SE 10.

# Table of Contents
* [Latest News](#Latest_News)
* [Download JavaMail Release](#Download_JavaMail_Release)
* [API Documentation](#API_Documentation)
* [Help](#Help)
* [Bugs](#Bugs)
* [Development Releases](#Development_Releases)

# <a name="Latest_News"></a>Latest News

## November 26, 2018 - JavaBeans Activation Framework 1.2.1 Final Release ##

The 1.2.1 release is the first release of the Eclipse project for JAF
and includes no bug fixes or enhancements. It does include changes
to the Maven coordinates. The main jar file is now located at
[com.sun.activation:jakarta.activation](https://repo1.maven.org/maven2/com/sun/activation/jakarta.activation/1.2.1/jakarta.activation-1.2.1.jar).

This standalone release of JAF uses a
[Java Platform Module System](http://openjdk.java.net/projects/jigsaw/spec/)
"automatic" module name of `jakarta.activation`, which is different than the
module name used in JDK 9 and 10.
A future version will include full module metadata.

## September 14, 2018 - JavaBeans Activation Framework project moves to the Eclipse Foundation! ##

The JavaBeans Activation Framework project is now hosted at the Eclipse
Foundation as part of the
[EE4J project](https://projects.eclipse.org/projects/ee4j).

By contributing to this project, you agree to these additional terms of
use, described in [CONTRIBUTING](CONTRIBUTING.md).

# <a name="API_Documentation"></a>API Documentation

The JavaBeans Activation Framework 1.2 and earlier API is defined
through the Java Community Process as
[JSR 925](http://jcp.org/en/jsr/detail?id=925).

The JavaBeans Activation Framework API documentation is available
[here](https://eclipse-ee4j.github.io/jaf/docs/api/).

The following documents summarize the API changes in each release of
the JavaBeans Activation Framework API specification:

-   [JAF 1.2](docs/JAF-1.2-changes.txt)
-   [JAF 1.1](docs/JAF-1.1-changes.txt)

# <a name="Help"></a>Help

You can post questions to the
[jaf-dev mailing list](https://accounts.eclipse.org/mailing-list/jaf-dev).

# <a name="Bugs"></a>Bugs

JAF bugs are tracked in the
[GitHub JAF project issue tracker](https://github.com/eclipse-ee4j/jaf/issues).

# <a name="Development_Releases"></a>Development Releases

From time to time snapshot releases of the next version of JAF
under development are published to the
[Sonatype OSSRH repository](http://oss.sonatype.org).
These snapshot releases have received only minimal testing, but may
provide previews of bug fixes or new features under development.

For example, you can download the jakarta.activation.jar file from the JAF
1.2.2-SNAPSHOT release
[here](https://oss.sonatype.org/content/repositories/snapshots/com/sun/activation/jakarta.activation/1.2.2-SNAPSHOT/).
Be sure to scroll to the bottom and choose the jar file with the most
recent time stamp.
