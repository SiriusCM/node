// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/Message.proto

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Data)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string op = 1;</code>
     */
    java.lang.String getOp();
    /**
     * <code>string op = 1;</code>
     */
    com.google.protobuf.ByteString
        getOpBytes();

    /**
     * <code>double x = 2;</code>
     */
    double getX();

    /**
     * <code>double y = 3;</code>
     */
    double getY();
  }
  /**
   * Protobuf type {@code Data}
   */
  public  static final class Data extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Data)
      DataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Data.newBuilder() to construct.
    private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Data() {
      op_ = "";
      x_ = 0D;
      y_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Data(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              op_ = s;
              break;
            }
            case 17: {

              x_ = input.readDouble();
              break;
            }
            case 25: {

              y_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Message.internal_static_Data_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Message.internal_static_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Message.Data.class, Message.Data.Builder.class);
    }

    public static final int OP_FIELD_NUMBER = 1;
    private volatile java.lang.Object op_;
    /**
     * <code>string op = 1;</code>
     */
    public java.lang.String getOp() {
      java.lang.Object ref = op_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        op_ = s;
        return s;
      }
    }
    /**
     * <code>string op = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOpBytes() {
      java.lang.Object ref = op_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        op_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int X_FIELD_NUMBER = 2;
    private double x_;
    /**
     * <code>double x = 2;</code>
     */
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 3;
    private double y_;
    /**
     * <code>double y = 3;</code>
     */
    public double getY() {
      return y_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getOpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, op_);
      }
      if (x_ != 0D) {
        output.writeDouble(2, x_);
      }
      if (y_ != 0D) {
        output.writeDouble(3, y_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getOpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, op_);
      }
      if (x_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, x_);
      }
      if (y_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, y_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Message.Data)) {
        return super.equals(obj);
      }
      Message.Data other = (Message.Data) obj;

      boolean result = true;
      result = result && getOp()
          .equals(other.getOp());
      result = result && (
          java.lang.Double.doubleToLongBits(getX())
          == java.lang.Double.doubleToLongBits(
              other.getX()));
      result = result && (
          java.lang.Double.doubleToLongBits(getY())
          == java.lang.Double.doubleToLongBits(
              other.getY()));
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + getOp().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Message.Data parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message.Data parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message.Data parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message.Data parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message.Data parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message.Data parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message.Data parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message.Data parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message.Data parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Message.Data parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message.Data parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message.Data parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Message.Data prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Data}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Data)
        Message.DataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Message.internal_static_Data_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Message.internal_static_Data_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Message.Data.class, Message.Data.Builder.class);
      }

      // Construct using Message.Data.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        op_ = "";

        x_ = 0D;

        y_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Message.internal_static_Data_descriptor;
      }

      public Message.Data getDefaultInstanceForType() {
        return Message.Data.getDefaultInstance();
      }

      public Message.Data build() {
        Message.Data result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Message.Data buildPartial() {
        Message.Data result = new Message.Data(this);
        result.op_ = op_;
        result.x_ = x_;
        result.y_ = y_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Message.Data) {
          return mergeFrom((Message.Data)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Message.Data other) {
        if (other == Message.Data.getDefaultInstance()) return this;
        if (!other.getOp().isEmpty()) {
          op_ = other.op_;
          onChanged();
        }
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Message.Data parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Message.Data) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object op_ = "";
      /**
       * <code>string op = 1;</code>
       */
      public java.lang.String getOp() {
        java.lang.Object ref = op_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          op_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string op = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOpBytes() {
        java.lang.Object ref = op_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          op_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string op = 1;</code>
       */
      public Builder setOp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string op = 1;</code>
       */
      public Builder clearOp() {
        
        op_ = getDefaultInstance().getOp();
        onChanged();
        return this;
      }
      /**
       * <code>string op = 1;</code>
       */
      public Builder setOpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        op_ = value;
        onChanged();
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 2;</code>
       */
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 2;</code>
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 2;</code>
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 3;</code>
       */
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 3;</code>
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 3;</code>
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Data)
    }

    // @@protoc_insertion_point(class_scope:Data)
    private static final Message.Data DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Message.Data();
    }

    public static Message.Data getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Data>
        PARSER = new com.google.protobuf.AbstractParser<Data>() {
      public Data parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Data(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Data> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Data> getParserForType() {
      return PARSER;
    }

    public Message.Data getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Data_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023proto/Message.proto\"(\n\004Data\022\n\n\002op\030\001 \001(" +
      "\t\022\t\n\001x\030\002 \001(\001\022\t\n\001y\030\003 \001(\001B\tB\007Messageb\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Data_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Data_descriptor,
        new java.lang.String[] { "Op", "X", "Y", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
