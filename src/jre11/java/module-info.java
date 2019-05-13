module jakarta.activation {
	requires static java.datatransfer;
	requires static java.desktop;
	requires java.logging;

	exports javax.activation;

/*	exports com.sun.activation.registries;
	exports com.sun.activation.viewers;*/
}