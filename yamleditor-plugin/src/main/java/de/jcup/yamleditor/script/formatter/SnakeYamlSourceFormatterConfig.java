package de.jcup.yamleditor.script.formatter;

import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.ScalarStyle;

public class SnakeYamlSourceFormatterConfig implements YamlSourceFormatterConfig {
    
    public static final int SNAKE_MAX_LINELENGTH = 400;// snake max is ?
    public static final int SNAKE_MAX_INDENT = 10;// snake max is 10
    
    private boolean explicitStart = false;
    private boolean explicitEnd = false;
    private int indent = 2;
    private int lineLength = 120;
    private FlowStyle flowStyle = FlowStyle.BLOCK;
    private boolean prettyFlow = false;
    private ScalarStyle scalarStyle = ScalarStyle.PLAIN;
    boolean multiDocFileStartingWithSeparator=false;

    public SnakeYamlSourceFormatterConfig() {
    }

    public SnakeYamlSourceFormatterConfig(YamlSourceFormatterConfig toCopy) {
        if (toCopy==null) {
            return;
        }
        this.indent=toCopy.getIndent();
        if (this.indent>SNAKE_MAX_INDENT) {
            this.indent=SNAKE_MAX_INDENT;
        }
        this.lineLength=toCopy.getLineLength();
        if (this.lineLength>SNAKE_MAX_LINELENGTH) {
            this.lineLength=SNAKE_MAX_LINELENGTH;
        }
    }
    
    
    @Override
    public int getIndent() {
        return indent;
    }
    
    @Override
    public int getLineLength() {
        return lineLength;
    }
    public boolean isExplicitEnd() {
        return explicitEnd;
    }

    public boolean isExplicitStart() {
        return explicitStart;
    }

    public boolean isPrettyFlow() {
        return prettyFlow;
    }

    public FlowStyle getFlowStyle() {
        return flowStyle;
    }

    public ScalarStyle getScalarStyle() {
        return scalarStyle;
    }


    public void setExplicitStart(boolean explicitStart) {
        this.explicitStart = explicitStart;
    }

    public void setExplicitEnd(boolean explicitEnd) {
        this.explicitEnd = explicitEnd;
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

    public void setFlowStyle(FlowStyle flowStyle) {
        this.flowStyle = flowStyle;
    }

    public void setPrettyFlow(boolean prettyFlow) {
        this.prettyFlow = prettyFlow;
    }

    public void setScalarStyle(ScalarStyle scalarStyle) {
        this.scalarStyle = scalarStyle;
    }

}