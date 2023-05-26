// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: radar.proto

package com.sdia.stubs;

public final class Radar {
  private Radar() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DetectRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DetectRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 radarId = 1;</code>
     * @return The radarId.
     */
    long getRadarId();

    /**
     * <code>string vehicleId = 2;</code>
     * @return The vehicleId.
     */
    java.lang.String getVehicleId();
    /**
     * <code>string vehicleId = 2;</code>
     * @return The bytes for vehicleId.
     */
    com.google.protobuf.ByteString
        getVehicleIdBytes();

    /**
     * <code>double speed = 3;</code>
     * @return The speed.
     */
    double getSpeed();
  }
  /**
   * Protobuf type {@code DetectRequest}
   */
  public  static final class DetectRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DetectRequest)
      DetectRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetectRequest.newBuilder() to construct.
    private DetectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetectRequest() {
      vehicleId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DetectRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetectRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              radarId_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              vehicleId_ = s;
              break;
            }
            case 25: {

              speed_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.sdia.stubs.Radar.internal_static_DetectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sdia.stubs.Radar.internal_static_DetectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sdia.stubs.Radar.DetectRequest.class, com.sdia.stubs.Radar.DetectRequest.Builder.class);
    }

    public static final int RADARID_FIELD_NUMBER = 1;
    private long radarId_;
    /**
     * <code>int64 radarId = 1;</code>
     * @return The radarId.
     */
    public long getRadarId() {
      return radarId_;
    }

    public static final int VEHICLEID_FIELD_NUMBER = 2;
    private volatile java.lang.Object vehicleId_;
    /**
     * <code>string vehicleId = 2;</code>
     * @return The vehicleId.
     */
    public java.lang.String getVehicleId() {
      java.lang.Object ref = vehicleId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vehicleId_ = s;
        return s;
      }
    }
    /**
     * <code>string vehicleId = 2;</code>
     * @return The bytes for vehicleId.
     */
    public com.google.protobuf.ByteString
        getVehicleIdBytes() {
      java.lang.Object ref = vehicleId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vehicleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SPEED_FIELD_NUMBER = 3;
    private double speed_;
    /**
     * <code>double speed = 3;</code>
     * @return The speed.
     */
    public double getSpeed() {
      return speed_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (radarId_ != 0L) {
        output.writeInt64(1, radarId_);
      }
      if (!getVehicleIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vehicleId_);
      }
      if (speed_ != 0D) {
        output.writeDouble(3, speed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (radarId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, radarId_);
      }
      if (!getVehicleIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vehicleId_);
      }
      if (speed_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, speed_);
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
      if (!(obj instanceof com.sdia.stubs.Radar.DetectRequest)) {
        return super.equals(obj);
      }
      com.sdia.stubs.Radar.DetectRequest other = (com.sdia.stubs.Radar.DetectRequest) obj;

      if (getRadarId()
          != other.getRadarId()) return false;
      if (!getVehicleId()
          .equals(other.getVehicleId())) return false;
      if (java.lang.Double.doubleToLongBits(getSpeed())
          != java.lang.Double.doubleToLongBits(
              other.getSpeed())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RADARID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRadarId());
      hash = (37 * hash) + VEHICLEID_FIELD_NUMBER;
      hash = (53 * hash) + getVehicleId().hashCode();
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getSpeed()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sdia.stubs.Radar.DetectRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.sdia.stubs.Radar.DetectRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code DetectRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DetectRequest)
        com.sdia.stubs.Radar.DetectRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sdia.stubs.Radar.internal_static_DetectRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sdia.stubs.Radar.internal_static_DetectRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sdia.stubs.Radar.DetectRequest.class, com.sdia.stubs.Radar.DetectRequest.Builder.class);
      }

      // Construct using com.sdia.stubs.Radar.DetectRequest.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        radarId_ = 0L;

        vehicleId_ = "";

        speed_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sdia.stubs.Radar.internal_static_DetectRequest_descriptor;
      }

      @java.lang.Override
      public com.sdia.stubs.Radar.DetectRequest getDefaultInstanceForType() {
        return com.sdia.stubs.Radar.DetectRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.sdia.stubs.Radar.DetectRequest build() {
        com.sdia.stubs.Radar.DetectRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sdia.stubs.Radar.DetectRequest buildPartial() {
        com.sdia.stubs.Radar.DetectRequest result = new com.sdia.stubs.Radar.DetectRequest(this);
        result.radarId_ = radarId_;
        result.vehicleId_ = vehicleId_;
        result.speed_ = speed_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sdia.stubs.Radar.DetectRequest) {
          return mergeFrom((com.sdia.stubs.Radar.DetectRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sdia.stubs.Radar.DetectRequest other) {
        if (other == com.sdia.stubs.Radar.DetectRequest.getDefaultInstance()) return this;
        if (other.getRadarId() != 0L) {
          setRadarId(other.getRadarId());
        }
        if (!other.getVehicleId().isEmpty()) {
          vehicleId_ = other.vehicleId_;
          onChanged();
        }
        if (other.getSpeed() != 0D) {
          setSpeed(other.getSpeed());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.sdia.stubs.Radar.DetectRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sdia.stubs.Radar.DetectRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long radarId_ ;
      /**
       * <code>int64 radarId = 1;</code>
       * @return The radarId.
       */
      public long getRadarId() {
        return radarId_;
      }
      /**
       * <code>int64 radarId = 1;</code>
       * @param value The radarId to set.
       * @return This builder for chaining.
       */
      public Builder setRadarId(long value) {
        
        radarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 radarId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRadarId() {
        
        radarId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object vehicleId_ = "";
      /**
       * <code>string vehicleId = 2;</code>
       * @return The vehicleId.
       */
      public java.lang.String getVehicleId() {
        java.lang.Object ref = vehicleId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          vehicleId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string vehicleId = 2;</code>
       * @return The bytes for vehicleId.
       */
      public com.google.protobuf.ByteString
          getVehicleIdBytes() {
        java.lang.Object ref = vehicleId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vehicleId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string vehicleId = 2;</code>
       * @param value The vehicleId to set.
       * @return This builder for chaining.
       */
      public Builder setVehicleId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        vehicleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string vehicleId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVehicleId() {
        
        vehicleId_ = getDefaultInstance().getVehicleId();
        onChanged();
        return this;
      }
      /**
       * <code>string vehicleId = 2;</code>
       * @param value The bytes for vehicleId to set.
       * @return This builder for chaining.
       */
      public Builder setVehicleIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        vehicleId_ = value;
        onChanged();
        return this;
      }

      private double speed_ ;
      /**
       * <code>double speed = 3;</code>
       * @return The speed.
       */
      public double getSpeed() {
        return speed_;
      }
      /**
       * <code>double speed = 3;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(double value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double speed = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        
        speed_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DetectRequest)
    }

    // @@protoc_insertion_point(class_scope:DetectRequest)
    private static final com.sdia.stubs.Radar.DetectRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sdia.stubs.Radar.DetectRequest();
    }

    public static com.sdia.stubs.Radar.DetectRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DetectRequest>
        PARSER = new com.google.protobuf.AbstractParser<DetectRequest>() {
      @java.lang.Override
      public DetectRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetectRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetectRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetectRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sdia.stubs.Radar.DetectRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013radar.proto\032\033google/protobuf/empty.pro" +
      "to\"B\n\rDetectRequest\022\017\n\007radarId\030\001 \001(\003\022\021\n\t" +
      "vehicleId\030\002 \001(\t\022\r\n\005speed\030\003 \001(\0012J\n\014RadarS" +
      "ervice\022:\n\020DetectInfraction\022\016.DetectReque" +
      "st\032\026.google.protobuf.EmptyB\020\n\016com.sdia.s" +
      "tubsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_DetectRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DetectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectRequest_descriptor,
        new java.lang.String[] { "RadarId", "VehicleId", "Speed", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
